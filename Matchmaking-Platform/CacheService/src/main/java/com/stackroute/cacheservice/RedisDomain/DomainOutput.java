package com.stackroute.cacheservice.RedisDomain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DomainOutput {
    List<RedisDomain> domains;
}
