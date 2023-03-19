package com.codegenerator.QRCodeGenerator.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
@Data
@Table
public class QRCodeDetails {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "QR_ID")
    public UUID id;

    @Column(unique = false)
    public String customer_first_name;

    @Column(unique = false)
    public String customer_last_name;

    @Column(unique = true, length = 10)
    public String customer_mobile;

    @Column(unique = true, length = 11)
    public String customer_account_number;

    @Column(unique = false)
    public String bank_code;

    @Column(unique = false)
    public String customer_address;

    @Column(unique = false)
    public String customer_active;


}
