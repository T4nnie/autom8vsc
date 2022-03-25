package eqlvsc;

public enum agePossible {
    SIX((byte)6),
    SEPT((byte)7),
    HUIT((byte)8),
    NEUF((byte)9),
    DIX((byte)10); 

    private byte age;

    private agePossible(byte a){
        this.age = a ;
    }

    public byte getValue(){
        return age ;
    }
   
}
