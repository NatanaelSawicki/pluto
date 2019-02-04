package enums;

public enum JulyMessageDigestEnum {
    MD2, MD5,
    SHA1, SHA256, SHA384, SHA512;
    
    public String getValue(){
        switch(this){
            case MD2:
                return "md2";
            case MD5:
                return "md5";
            case SHA1:
                return "sha-1";
            case SHA256:
                return "sha-256";
            case SHA384:
                return "sha-384";
            case SHA512:
                return "sha-512";
        }
        return "";
    }
}
