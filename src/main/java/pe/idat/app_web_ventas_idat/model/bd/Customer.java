package pe.idat.app_web_ventas_idat.model.bd;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    private String customerid;
    @Column(name = "companyname")
    private String companyname;
    @Column(name = "contacname")
    private String contacname;
    @Column(name = "contacttitle")
    private String contacttitle;
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "region")
    private String region;
    @Column(name = "postalcode")
    private String postalcode;
    @Column(name = "contry")
    private String contry;
    @Column(name = "phone")
    private String phone;
    @Column(name = "fax")
    private String fax;


}
