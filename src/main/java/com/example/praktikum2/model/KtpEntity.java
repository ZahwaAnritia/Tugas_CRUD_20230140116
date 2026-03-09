package com.example.praktikum2.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "KTP")
@Data
public class KtpEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nomorKtp", unique = true, nullable = false)
    private String nomorKtp;
    @Column(name = "namaLengkap")
    private String namaLengkap;

    @Column(name = "alamat")
    private String alamat;

    @Column(name = "tanggalLahir")
    private LocalDate tanggalLahir;
    @Column(name = "jenisKelamin")
    private String jenisKelamin;
}