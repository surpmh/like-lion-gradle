package hospital.domain;

public class Hospital {
    private String id;
    private String address;
//    private String district;
//    private String category;
//    private Integer emergencyRoom;
//    private String name;
//    private String subdivision;

    public Hospital(String id, String address) {
        this.id = id;
        this.address = address;
//        this.district = district;
//        this.category = category;
//        this.emergencyRoom = emergencyRoom;
//        this.name = name;
//        this.subdivision = subdivision;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

//    public String getDistrict() {
//        return district;
//    }
//
//    public String getCategory() {
//        return category;
//    }
//
//    public Integer getEmergencyRoom() {
//        return emergencyRoom;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getSubdivision() {
//        return subdivision;
//    }

}
