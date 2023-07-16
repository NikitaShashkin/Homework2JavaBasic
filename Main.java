public class Main {
    public static void main(String[] args) {

        System.out.println("Прогноз погоды на неделю:");
        Weather weatherBox = new Weather();

        System.out.println("Погода "+ weatherBox.day1 + ": " + weatherBox.weatherOfDay1 + " " + weatherBox.temperatureOfDay1 + weatherBox.degreeOfDay1);
        System.out.println("Погода "+ weatherBox.day2 + ": " + weatherBox.weatherOfDay2 + " " + weatherBox.temperatureOfDay2 + weatherBox.degreeOfDay2);
        System.out.println("Погода "+ weatherBox.day3 + ": " + weatherBox.weatherOfDay3 + " " + weatherBox.temperatureOfDay3 + weatherBox.degreeOfDay3);
        System.out.println("Погода "+ weatherBox.day4 + ": " + weatherBox.weatherOfDay4 + " " + weatherBox.temperatureOfDay4 + weatherBox.degreeOfDay4);
        System.out.println("Погода "+ weatherBox.day5 + ": " + weatherBox.weatherOfDay5 + " " + weatherBox.temperatureOfDay5 + weatherBox.degreeOfDay5);
        System.out.println("Погода "+ weatherBox.day6 + ": " + weatherBox.weatherOfDay6 + " " + weatherBox.temperatureOfDay6 + weatherBox.degreeOfDay6);
        System.out.println("Погода "+ weatherBox.day7 + ": " + weatherBox.weatherOfDay7 + " " + weatherBox.temperatureOfDay7 + weatherBox.degreeOfDay7);


    }
}