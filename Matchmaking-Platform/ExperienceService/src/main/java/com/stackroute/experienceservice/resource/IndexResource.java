package com.stackroute.experienceservice.resource;

import com.stackroute.experienceservice.domain.CommonOutput;
import com.stackroute.experienceservice.domain.KafkaProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/*
 *  IndexResource is a service used to produce data
 *  to indexer topic.
 */
@Service
public class IndexResource {
    @Autowired
    private KafkaTemplate<String, CommonOutput> kafkaTemplate;


    private KafkaProperties kafkaProperties;

    /*
     *  Used to get kafka properties (kafka Ip address
     *  ,kafka port, topic)
     */
    @Autowired
    public void setApp(KafkaProperties kafkaProperties){
        this.kafkaProperties=kafkaProperties;
    }

    /*
     *  Used to send data(CommonOutput) to indexer topic.
     */
    public void postDate(CommonOutput commonOutput)
    {
        kafkaTemplate.send(kafkaProperties.getOutputTopic(),commonOutput);
    }
}
