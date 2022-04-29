package com.dlithe.serviceImpl;

import com.dlithe.dto.FeedbackResponse;
import com.dlithe.dto.InsuranceAgentDetailsRequest;
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
    public String insuranceAgent(InsuranceAgentDetailsRequest insuranceAgentDetailsRequest) {
        Agent agent = new Agent();

        agent.setName(insuranceAgentDetailsRequest.getName());
        agent.setLocation(insuranceAgentDetailsRequest.getLocation());

        agentDAO.save(agent);
        return "Agent added Successfully";
    }

    /*@Override
    public InsuranceAgentDetailsRequest getAgentDetails(int agentId) {
        Optional<Agent> agents = agentDAO.findById(agentId);

        InsuranceAgentDetailsRequest agentDetails = new InsuranceAgentDetailsRequest();
        agentDetails.setName(agents.get().getName());
        agentDetails.setLocation(agents.get().getLocation());
        return agentDetails;
    }*/

    @Override
    public InsuranceAgentDetailsRequest getAgentDetails(int agentId) {
        FeedbackResponse feedbackResponse = new FeedbackResponse();

        List<FeedbackResponse> feedbackResponseList= new ArrayList<>();
        Optional<Agent> agents = agentDAO.findById(agentId);

        InsuranceAgentDetailsRequest agentDetails = new InsuranceAgentDetailsRequest();
        agentDetails.setName(agents.get().getName());
        agentDetails.setLocation(agents.get().getLocation());

        feedbackResponse.setFeedbackName("Murty");
        feedbackResponse.setFeedback("Hard worker");
        feedbackResponse.setRating("5");
        feedbackResponseList.add(feedbackResponse);

        FeedbackResponse feedbackResponse1 = new FeedbackResponse();
        feedbackResponse1.setFeedbackName("Murty");
        feedbackResponse1.setFeedback("Hard worker");
        feedbackResponse1.setRating("5");
        feedbackResponseList.add(feedbackResponse1);


        agentDetails.setFeedbackResponse(feedbackResponseList);
        return agentDetails;
    }


}



