
//Задача:
//
//Заполните массив случайным числами и выведите максимальное, минимальное и ??среднее значение.
//
//??Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].

class MaxMinAver {
    public static void main(String[] args) {
        int[] nums = { 23, 555, 3443, -44, 45, 76, 1205, -4343, 1, 90 };

        int min, max;

        min = max = nums[0];

        for(int i = 1; i < 10; i++) {
            if(nums[i] < min) min = nums[i];
            if(nums[i] > max) max = nums[i];
        }
        System.out.println("Максимальное и минимальное значение: " + max + " " + min);

    }
}