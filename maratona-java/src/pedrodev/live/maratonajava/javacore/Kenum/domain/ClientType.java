package pedrodev.live.maratonajava.javacore.Kenum.domain;

public enum ClientType {
    PHYSICAL_PERSON(1,"Physical Person"),
    JURIDICAL_PERSON(2, "Juridical Person");

    private final int value;

    public String getPrintName() {
        return printName;
    }

    private String printName;
    ClientType(int value, String printName) {
    this.value = value;
    this.printName = printName;
    }

    public static ClientType clientTypeByPrintName(String printName ){
        for (ClientType clientType : values()) {
            if(clientType.getPrintName().equals(printName)){
                return clientType;
            }
        }
        return  null;

    }

    public int getValue() {
        return value;
    }
}
