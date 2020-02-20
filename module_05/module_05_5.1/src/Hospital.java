import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.stream.Stream;

public class Hospital {
    public static void main(String[] args) {
        int id = 1;
        int kd = 0;
        double sumTemperature = 0;
        double sumAve;
        final int PATIENTS = 30;
        final double MAX_TEMP = 40;
        final double MIN_TEMP = 32;
        final double MAX_TEMP_NORM = 36.9;
        final double MIN_TEMP_NORM = 36.2;
        DecimalFormat formatter = new DecimalFormat("#0.00°C");
        double [] patient = new double[PATIENTS];
        for (int i = 0; i < patient.length; i++){
            patient[i] = ((double)(Math.random() * (MAX_TEMP - MIN_TEMP)) + MIN_TEMP);
            //System.out.println("Температура пациента " + id + ": "+ formatter.format(patient[i]));
            id++;
        }

        System.out.println("Список температуры больных: " + Arrays.toString(patient).replaceAll("\\[", "").replaceAll("\\]", ""));// Печать массива в строку

        for (int j = 0; j < patient.length; j++)
        {
            sumTemperature += + patient[j];
        }
        sumAve = sumTemperature / patient.length;
        System.out.println();
        System.out.println("Средняя температура по больнице: " + formatter.format(sumAve));
        System.out.println();

        for (int k = 0; k < patient.length; k++){
            if (patient[k] > MIN_TEMP_NORM && patient[k] < MAX_TEMP_NORM){
                kd++;
                System.out.println("Пациент " + (k + 1) + " здоров! Его температура: " + formatter.format(patient[k]));
            }
        }
        System.out.println("Количество здоровых пациентов: " + kd);
    }
}
