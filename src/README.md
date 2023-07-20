# Задание 2
1. Надеюсь у нас где-то инициализирован массив ранее если мы берем из него элемент
2. Исключение обработки деления на 0 у нас присутствует, вроде все норм
3. Если размер массива меньше, чем позиция элемента по индексу, можно добавить выход за границы массива


# Задание 3
1. выход за пределы массива добавил
2. лишнее FileNotFoundException
3. не можем делить на ноль
4. Блок catch с Throwable заменен на блок catch с Exception, так как это более общий тип исключений.
5. убрал из объявления метода выброс исключения оно обрабатывается в catch
* public static void main(String args) {
* try {
* int a = 90;
* int b = 3;
* System.out.println(a / b);
* printSum(23, 234);
* int abc = {1, 2};
* abc3 = 9;
* } catch (ArithmeticException ex) {
* System.out.println("Деление на ноль!");
* } catch (NullPointerException ex) {
* System.out.println("Указатель не может указывать на null!");
* } catch (ArrayIndexOutOfBoundsException ex) {
* System.out.println("Выход за пределы массива!");
* } catch (Exception ex) {
* System.out.println("Что-то пошло не так...");
* }
* }

* public static void printSum(Integer a, Integer b) {
* System.out.println(a + b);
* }