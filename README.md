Lesson 8 ДЗ №8
1️⃣
Создай Java проект в IDE.
Создай файл (класс) с именем DateTimeUtils.
Объяви внутри DateTimeUtils глобальную функцию, которая принимает год и возвращает, является ли он високосным.
Правила определения високосности подсмотри тут – https://learn.microsoft.com/ru-ru/office/troubleshoot/excel/determine-a-leap-year

2️⃣
Создай файл (класс) с именем ArrayUtils.
Объяви внутри ArrayUtils глобальную функцию, которая принимает массив int[] и возвращает double среднее арифметическое от всех его элементов.

3️⃣
Объяви внутри ArrayUtils глобальную функцию, которая принимает массив int[] и разворачивает его. Например, массив {1, 4, 3, 2} должен стать {2, 3, 4, 1}.

4️⃣
Объяви внутри ArrayUtils глобальную функцию, которая принимает массив int[], искомое значение int и возвращает индекс первого вхождения этого значения в массиве. Если такого значения в массиве нет, то возвращается специальное значение -1. Например, для массива {1, 2, 3, 4} и искомого значения 3 результат будет 2.

5️⃣
Объяви внутри ArrayUtils глобальную функцию, которая принимает массив int[], начальный индекс (включительно), конечный индекс (не включительно) и возвращает подмассив (subarray, часть массива) между этими индексами. Например, для массива {1, 2, 3, 4, 5} и индексов 1 и 3 результат будет {2, 3}.

6️⃣
Видел на сайтах постраничный вывод данных? Например, из всего списка товаров интернет-магазин показывает изначально 10. Можно перейти на следующую страницу каталога, тогда будут показаны следующие 10 и т.д. Объяви внутри ArrayUtils глобальную функцию, которая принимает массив int[], номер страницы (считая от 1), количество элементов на одной странице и возвращает массив (подмассив), соответствующий заданной странице. Например, для массива {1, 2, 3, 4, 5, 6, 7} и размера страницы 3 результаты будут:
Страница 1 – {1, 2, 3}
Страница 2 – {4, 5, 6}
Страница 3 – {7}

7️⃣
Создай файл (класс) с именем UserInputUtils.
Объяви глобальную функцию, внутри которой у пользователя с консоли запрашивается размер массива int[] и соответствующее количество его значений. Создай массив по вводимым пользователем данным и верни из функции.

8️⃣
Создай файл (класс) с именем HomeWork8 с функцией main. Запроси у пользователя число от 1 до 6 – номер задачи. По номеру должна происходить демонстрация работы соответствующей задачи. Запроси у пользователя входные аргументы функции. Для ввода массивов используй функцию из задачи 7. Вызови функцию с пользовательскими аргументами и выведи её результат на консоль.

⚠️ Во всех задачах из стандартной библиотеки можно использовать только Math, Arrays.toString(array) и всё, что вам нужно для ввода-вывода на консоль. На реальных проектах таких ограничений нет.
На реальном проекте мы бы в принципе не объявляли и не реализовывали функции из условий. Это типовые задачи. Они решены и протестированы в готовых библиотеках. Но сейчас мы учимся. Самостоятельная реализация таких базовых вещей позволит лучше понимать, что может происходить “под капотом”.

Сделаем допущение, что пользователь в консоли вводит всегда корректный тип данных.

Подумай, какие значения для параметров функции являются ошибочными с точки зрения логики. Для них должны быть выведены в консоль человекочитаемые сообщения об ошибке, а программа должна аварийно завершить свою работу. Для этого можешь воспользоваться инструкцией:

throw new IllegalArgumentException("Твоё сообщение об ошибке");
