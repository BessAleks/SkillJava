public class TextEng {
    public static void main(String[] args) {
        String str = "In the textbook tale of scientific discovery, the researcher works late into the night, alone in their lab. Suddenly, genius strikes: an apple to the head, a lightning strike to a key, a contaminated petri dish. And eureka: discovery! The Miriam Menkin story is a little different. One Tuesday in February 1944, the 43-year-old lab technician was up all night soothing her eight-month-old daughter – “an in vivo specimen”, she liked to say – who had just started teething. The next morning, Menkin went into her lab, just as she had every week for the past six years. Wednesdays were when she introduced a newly washed egg to a cloud of sperm solution in a glass dish and prayed that two would become one. As a technician for Harvard fertility expert John Rock, Menkin’s goal was to fertilise an egg outside the human body. This was the first step in Rock’s plan to cure infertility, which remained a scientific mystery to doctors. He particularly wanted to help women who had healthy ovaries but damaged fallopian tubes – the cause of one-fifth of the infertility cases he saw in his clinic.";
        String[] subStr;
        String delitel = " ";
        subStr = str.split(delitel);
        for(int i = 0; i < subStr.length; i++) {
            System.out.println(subStr[i].replaceAll("\\p{Punct}",""));
        }
    }
}
