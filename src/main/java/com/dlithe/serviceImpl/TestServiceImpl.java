package com.dlithe.serviceImpl;

import com.dlithe.dto.FeedbackResponse;
import com.dlithe.dto.InsuranceAgentDetailsResponse;
import com.dlithe.dto.InsuranceUserDetailsRequest;
import com.dlithe.entity.Agent;
import com.dlithe.repository.AgentDAO;
import com.dlithe.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private AgentDAO agentDAO;

    @Override
    public String fetchBankingDetails(String bankName) {
        if (bankName != null) {

            switch (bankName) {
                case "One":
                    return "Canara Bank";
                case "Two":
                    return "Kotak Bank";
                case "Three":
                    return "ICICI Bank";
                case "Four":
                    return "Union Bank";
                default:
                    return "No Bank Found";
            }
        } else {
            return "null";
        }
    }
        @Override
        public String signUpUser(InsuranceUserDetailsRequest insuranceUserDetailsRequest){
            System.out.println(insuranceUserDetailsRequest);
        return null;
        }

    @Override
    public String insuranceAgent(InsuranceAgentDetailsResponse insuranceAgentDetailsResponse) {
        Agent agent = new Agent();

        agent.setName(insuranceAgentDetailsResponse.getName());
        agent.setLocation(insuranceAgentDetailsResponse.getLocation());

        agentDAO.save(agent);
        return "Agent added Successfully";
    }

    /*@Override
    public InsuranceAgentDetailsRequest getAgentFeedback(int agentId) {
        return null;
    }*/

    /*@Override
    public InsuranceAgentDetailsRequest getAgentDetails(int agentId) {
        Optional<Agent> agents = agentDAO.findById(agentId);
            Agent agentLogin = agents.get()
        InsuranceAgentDetailsRequest agentDetails = new InsuranceAgentDetailsRequest();
        agentDetails.setName(agents.get().getName());
        agentDetails.setLocation(agents.get().getLocation());
        return agentDetails;
    }*/

    @Override
    public InsuranceAgentDetailsResponse getAgentDetails(int agentId) {
        FeedbackResponse feedbackResponse = new FeedbackResponse();

        List<FeedbackResponse> feedbackResponseList= new ArrayList<>();
        Optional<Agent> agents = agentDAO.findById(agentId);

        InsuranceAgentDetailsResponse agentDetails = new InsuranceAgentDetailsResponse();
        agentDetails.setName(agents.get().getName());
        agentDetails.setLocation(agents.get().getLocation());

        feedbackResponse.setFeedbackName("Murty");
        feedbackResponse.setFeedback("Hard worker");
        feedbackResponse.setRating(5);
        feedbackResponseList.add(feedbackResponse);

        FeedbackResponse feedbackResponse1 = new FeedbackResponse();
        feedbackResponse1.setFeedbackName("Narayan");
        feedbackResponse1.setFeedback("Smart worker");
        feedbackResponse1.setRating(4);
        feedbackResponseList.add(feedbackResponse1);


        agentDetails.setFeedbackResponse(feedbackResponseList);
        return agentDetails;
    }




}



