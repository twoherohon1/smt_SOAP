package com.example.demo.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import localhost._8080.CommitDataResponse;
import localhost._8080.CommitData;


@Endpoint
public class TestServiceEndpoint {
    private static final String NAMESPACE_URI = "http://localhost:8080/";

//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "TEST_CONNECT" )
//    @ResponsePayload
//    public CommitDataResponse testRequest(@RequestPayload CommitData request)throws Exception  {
//        CommitDataResponse commitDataResponse = new CommitDataResponse();
//        return commitDataResponse;
//    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CommitData" )
    @ResponsePayload
    public CommitDataResponse test(@RequestPayload CommitData request)throws Exception  {
        CommitDataResponse commitDataResponse = new CommitDataResponse();
        commitDataResponse.setCommitDataResult("test");
        return commitDataResponse;
    }

}
