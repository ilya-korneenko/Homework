package HomeWork3.calcs.api;


public interface ICalculator {
    double division(double divisible, double divisor);

    double multiplier(double first_num, double second_num);

    double sum(double first_summand, double second_summand);

    double difference(double reduced, double subtractible);

    double pow(double number, int degree);

    double module(double number);

    double mySqrt(double number);


}
