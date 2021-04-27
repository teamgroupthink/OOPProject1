public class HM_Employee {

    private String supervisor;
    private String name;
    private String hired;
    private String certificationLevel;
    private String userCertification;
    private String shift;
    private String shop;

    public HM_Employee(String supervisor, String name, String hired, String certificationLevel,
                       String userCertification, String shift, String shop) {
        this.supervisor = supervisor;
        this.name = name;
        this.hired = hired;
        this.certificationLevel = certificationLevel;
        this.userCertification = userCertification;
        this.shift = shift;
        this.shop = shop;
    }

    public void createRequest() {}

    public void createTurnIn() {}

    public void createAccRpt() {}

    @Override
    public String toString() {
        return String.format("Supervisor: %s%nName: %s%nHired: %s%nCert level: %s%nCert expiration: %s%n" +
                        "Shift: %s%nShop: %s",getSupervisor(),getName(),getHired(),getCertificationLevel(),
                getUserCertification(),getShift(),getShop());
    }

    //getters and setters
    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHired() {
        return hired;
    }

    public void setHired(String hired) {
        this.hired = hired;
    }

    public String getCertificationLevel() {
        return certificationLevel;
    }

    public void setCertificationLevel(String certificationLevel) {
        this.certificationLevel = certificationLevel;
    }

    public String getUserCertification() {
        return userCertification;
    }

    public void setUserCertification(String userCertification) {
        this.userCertification = userCertification;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }
}

class HM_Issuer extends HM_Employee{
    public HM_Issuer(String supervisor, String name, String hired, String certificationLevel,
                     String userCertification, String shift, String shop) {
        super(supervisor, name, hired, certificationLevel, userCertification, shift, shop);
    }

    public void acceptInventory() {}

    public void issueInventory() {}

    public void getAccidentReport() {}
}

class HM_Manager extends HM_Employee{

    public HM_Manager(String supervisor, String name, String hired, String certificationLevel,
                      String userCertification, String shift, String shop) {
        super(supervisor, name, hired, certificationLevel, userCertification, shift, shop);
    }

    private void createHMEmployee() {}

    private void deleteHMEmployee() {}

    private void updateCertificationDate() {}

    private void closeAccidentReport() {}

    private void grantOverride() {}
}

class HM_Cleaner extends HM_Employee{
    public HM_Cleaner(String supervisor, String name, String hired, String certificationLevel,
                      String userCertification, String shift, String shop) {
        super(supervisor, name, hired, certificationLevel, userCertification, shift, shop);
    }

    private void requestAccidentReportClose() {}
}
