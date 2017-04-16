public class RnaTranscription {

    public String ofDna(String dnaStrand) {
        String rnaStrand = "";
        for (String nucleotide : dnaStrand.split("")) {
            rnaStrand += rnaFromDna(nucleotide);
        }
        return rnaStrand;
    }

    private String rnaFromDna(String nucleotideShorthand) {
        return Nucleotides.fromDna(nucleotideShorthand).rnaComplement;
    }

}