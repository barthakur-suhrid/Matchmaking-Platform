package com.stackroute.indexerservice.domain.relationships;

import com.stackroute.indexerservice.domain.Project;
import com.stackroute.indexerservice.domain.Skill;
import com.stackroute.indexerservice.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.*;

import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@RelationshipEntity(type = "project_in")
public class ProjectRelationshipProperty {
    @Id
    private String relationship;
    @Properties
    private Map<String,String> properties;

    @StartNode
    private User user;
    @EndNode
    private Project project;
}
