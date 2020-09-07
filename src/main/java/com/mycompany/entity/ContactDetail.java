
package com.mycompany.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

/**
 * author Mamoloko
 * Date: 07/09/2020
 */

@Data
@Entity
public class ContactDetail {

    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contactDetailId;
    private String email;
    private String mobile;
}
