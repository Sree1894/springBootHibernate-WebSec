package com.magellanix.WebSecurity.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Data
@Getter
@Setter
public abstract class Audit {

    @CreatedDate
    private Date createDate;
    @LastModifiedDate
    private Date updateDate;
    @LastModifiedBy
    private String modifiedBy;


}
