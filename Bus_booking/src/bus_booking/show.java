/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus_booking;

/**
 *
 * @author suthesana
 */
public class show {
    private String emp_id,emp_name,emp_nic,emp_phone,emp_address,emp_mail,emp_password;

   

    public show(String emp_id, String emp_name, String emp_nic, String emp_phone, String emp_address, String emp_mail, String emp_password) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_nic = emp_nic;
        this.emp_phone = emp_phone;
        this.emp_address = emp_address;
        this.emp_mail = emp_mail;
        this.emp_password = emp_password;
    }

    public String getEmp_password() {
        return emp_password;
    }

    public void setEmp_password(String emp_password) {
        this.emp_password = emp_password;
    }
    

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_nic() {
        return emp_nic;
    }

    public void setEmp_nic(String emp_nic) {
        this.emp_nic = emp_nic;
    }

    public String getEmp_phone() {
        return emp_phone;
    }

    public void setEmp_phone(String emp_phone) {
        this.emp_phone = emp_phone;
    }

    public String getEmp_address() {
        return emp_address;
    }

    public void setEmp_address(String emp_address) {
        this.emp_address = emp_address;
    }

    public String getEmp_mail() {
        return emp_mail;
    }

    public void setEmp_mail(String emp_mail) {
        this.emp_mail = emp_mail;
    }
    
    
}
