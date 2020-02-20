public class Rainbow {
    public static void main(String[] args) {
        String text = "Красный оранжевый желтый зеленый голубой синий фиолетовый";
        String [] colors = text.split("\\s+");
        System.out.println("Распечатка массива в обратном порядке:");
        System.out.println();
        for (int i = colors.length - 1; i >= 0; i--){
            System.out.println(colors[i]);
        }
        System.out.println();
        System.out.println("Первый элемент массива: " + colors[0]);
        System.out.println();

        int hlp = colors.length;
        String temp;
        for (int i = 0; i < hlp/2; i++) {
            temp = colors[hlp-i-1];
            colors[hlp-i-1] = colors[i];
            colors[i] = temp;
        }
        for (int i=0; i<colors.length; i++){
            System.out.println(colors[i]);
        }
        System.out.println();
        System.out.println("Первый элемент массива после перевертывания элементов массива: " + colors[0]);
    }
}
