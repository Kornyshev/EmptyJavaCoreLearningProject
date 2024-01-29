package org.example.exceptions;

/**
 * Класс <b>MultipleCatchExample</b> демонстрирует использование нескольких блоков catch для обработки различных классов исключений в Java.
 * В этом примере показано, как перехватывать и обрабатывать конкретные исключения, такие как NullPointerException,
 * а также более общие исключения, покрываемые классом Exception.
 *
 * <p>В методе main представлен блок try, в котором происходит попытка доступа к длине строки, значение которой равно null.
 * Это приводит к возникновению NullPointerException. Блок catch для NullPointerException перехватывает это исключение и обрабатывает его,
 * выводя соответствующее сообщение. Если бы возникло иное исключение, оно было бы обработано вторым блоком catch, который перехватывает
 * любой тип Exception.</p>
 *
 * <p>Этот пример является полезным ресурсом для понимания, как управлять различными типами исключений в Java,
 * обеспечивая корректную обработку ошибок в приложении.</p>
 */
public class MultipleCatchExample {
}