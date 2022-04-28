package com.dlithe.controller;


import com.dlithe.dto.InsuranceUserDetailsRequest;
import com.dlithe.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class TestController {
   /* @GetMapping("test")
    public String myFirstMethod() {
        return "Welcome to java";
    }

    @GetMapping("banks/{bankName}")
    public String banking(@PathVariable String bankName) {
        switch (bankName){
            case "ICICI":
                return bankNameOne();
            case "Canara":
                return bankNameTwo();
            case "Union":
                return bankNameThree();
            case "Kotak":
                return bankNameFour();
            default:
                return "Bank Name not Found";
        }

    }

    public String bankNameOne(){
        return "ICICI Bank Limited is an Indian multinational bank and financial services company headquartered in Vadodara.";
    }
    public String bankNameTwo(){
        return "Canara Bank is the third largest nationalised bank in India.";
    }
    public String bankNameThree(){
        return "State Bank of India is an Indian multinational public sector bank and financial services statutory body headquartered in Mumbai";
    }
    public String bankNameFour(){
        return " Kotak Mahindra Bank Limited is an Indian banking and financial services company headquartered in Mumbai. ";
    }


    @GetMapping("addNumber/{numOne}/{numTwo}")
    public int addingNumbersMethod(@PathVariable int numOne, @PathVariable int numTwo){
        try{
            return numOne + numTwo;
        }catch (NumberFormatException e){
            throw new NumberFormatException("Not Found");
        }
    }

    @GetMapping("addNumbers")
    public int numberMethod() {
        return 400;
    }

    @GetMapping("num30")
    public String numTwo() {
        return "printing with end point number";
    }
*/
    @Autowired
    private TestService testService;

   @GetMapping("banking/{bankName}")
    public String detailsMethod(@PathVariable String bankName){
        return testService.fetchBankingDetails(bankName);
    }

    @PostMapping("insurance-user")
    public String signUpUserRegister(@RequestBody InsuranceUserDetailsRequest insuranceUserDetailsRequest){
        return testService.signUpUser(insuranceUserDetailsRequest);
    }

}

