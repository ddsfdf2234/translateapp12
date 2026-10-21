package com.example.translateapp12

data class Phrase(
    val original: String,
    val translation: String
)

data class Category(
    val name: String,
    val phrases: List<Phrase>
)

object Data {
    val categories = listOf(

        Category("Приветствия и общение", listOf(
            Phrase("Hello! How are you?", "Привет! Как дела?"),
            Phrase("Nice to meet you.", "Приятно познакомиться."),
            Phrase("Excuse me, can you help me?", "Извините, вы можете мне помочь?"),
            Phrase("I don't understand.", "Я не понимаю."),
            Phrase("Do you speak Russian?", "Вы говорите по-русски?"),
            Phrase("What time is it?", "Который сейчас час?"),
            Phrase("Thank you very much!", "Большое спасибо!"),
            Phrase("Goodbye, have a nice day!", "До свидания, хорошего дня!")
        )),

        Category("Аэропорт", listOf(
            Phrase("Where is the check-in desk?", "Где стойка регистрации?"),
            Phrase("Here is my passport and ticket.", "Вот мой паспорт и билет."),
            Phrase("What is the gate number?", "Какой номер выхода на посадку?"),
            Phrase("Is the flight delayed?", "Рейс задержан?"),
            Phrase("Where can I get my luggage?", "Где я могу получить багаж?"),
            Phrase("I have lost my boarding pass.", "Я потерял посадочный талон."),
            Phrase("Where is the duty-free shop?", "Где магазин беспошлинной торговли?")
        )),

        Category("Отель", listOf(
            Phrase("I have a reservation.", "У меня есть бронирование."),
            Phrase("I would like to check in.", "Я хотел бы зарегистрироваться."),
            Phrase("What time is breakfast?", "Во сколько завтрак?"),
            Phrase("What is the Wi-Fi password?", "Какой пароль от Wi-Fi?"),
            Phrase("Could I have an extra towel?", "Можно мне дополнительное полотенце?"),
            Phrase("The air conditioner is not working.", "Кондиционер не работает."),
            Phrase("I would like to check out.", "Я хотел бы выписаться.")
        )),

        Category("Ресторан", listOf(
            Phrase("A table for two, please.", "Столик на двоих, пожалуйста."),
            Phrase("Could I see the menu?", "Можно мне посмотреть меню?"),
            Phrase("I would like to order.", "Я хотел бы сделать заказ."),
            Phrase("What do you recommend?", "Что вы рекомендуете?"),
            Phrase("The bill, please.", "Счёт, пожалуйста."),
            Phrase("It was delicious, thank you.", "Было очень вкусно, спасибо."),
            Phrase("Can I pay by card?", "Можно оплатить картой?")
        )),

        Category("Магазин", listOf(
            Phrase("How much does it cost?", "Сколько это стоит?"),
            Phrase("Do you have this in another size?", "У вас есть это другого размера?"),
            Phrase("Can I pay by credit card?", "Можно оплатить кредитной картой?"),
            Phrase("I am just looking, thank you.", "Я просто смотрю, спасибо."),
            Phrase("Where is the fitting room?", "Где примерочная?"),
            Phrase("Can I have a receipt?", "Можно мне чек?"),
            Phrase("It is too expensive.", "Это слишком дорого.")
        )),

        Category("Транспорт", listOf(
            Phrase("How can I get to the city center?", "Как мне добраться до центра города?"),
            Phrase("Where is the nearest metro station?", "Где ближайшая станция метро?"),
            Phrase("One ticket, please.", "Один билет, пожалуйста."),
            Phrase("Does this bus go to the airport?", "Этот автобус едет в аэропорт?"),
            Phrase("Please call a taxi for me.", "Пожалуйста, вызовите мне такси."),
            Phrase("Stop here, please.", "Остановите здесь, пожалуйста.")
        )),

        Category("Экстренные ситуации", listOf(
            Phrase("Help! Call the police!", "Помогите! Вызовите полицию!"),
            Phrase("I need a doctor.", "Мне нужен врач."),
            Phrase("Where is the nearest hospital?", "Где ближайшая больница?"),
            Phrase("I have lost my wallet.", "Я потерял бумажник."),
            Phrase("I need an ambulance.", "Мне нужна скорая помощь."),
            Phrase("Is there a pharmacy nearby?", "Здесь есть аптека поблизости?")
        ))
    )
}