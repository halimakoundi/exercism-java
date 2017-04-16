public class RnaTranscription {
    
    public String ofDna(String dnaString) {
        String rnaString = "";
        for (String strand : dnaString.split("")) {
            rnaString += toRna(strand);
        }
        return rnaString;
    }

    private String toRna(String dnaString) {
        switch(dnaString){
            case "C": return "G";
            case "G": return "C";
            case "T": return "A";
            case "A": return "U";
        }
        return "";
    }
}