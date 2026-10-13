package com.example.translateapp12


data class Word(
    val original: String,      // слово на иностранном
    val transcription: String, // транскрипция
    val translation: String    // перевод на русский
)

data class Category(
    val name: String,          // название категории (рус)
    val words: List<Word>
)

enum class Language(val code: String, val displayName: String, val ttsLocale: String) {
    ENGLISH("en", "Английский", "en-US"),
    GERMAN("de", "Немецкий", "de-DE"),
    JAPANESE("ja", "Японский", "ja-JP")
}

object Data {

    // ------- Категории английского -------
    private val enHotel = Category(
        "Отель", listOf(
            Word("hotel", "[hoʊˈtel]", "отель"),
            Word("room", "[ruːm]", "номер"),
            Word("key", "[kiː]", "ключ"),
            Word("reception", "[rɪˈsepʃn]", "стойка регистрации"),
            Word("check-in", "[ˈtʃek ɪn]", "регистрация"),
            Word("check-out", "[ˈtʃek aʊt]", "выписка"),
            Word("reservation", "[ˌrezəˈveɪʃn]", "бронирование"),
            Word("breakfast", "[ˈbrekfəst]", "завтрак"),
            Word("towel", "[ˈtaʊəl]", "полотенце"),
            Word("pillow", "[ˈpɪləʊ]", "подушка"),
            Word("luggage", "[ˈlʌɡɪdʒ]", "багаж"),
            Word("elevator", "[ˈelɪveɪtə]", "лифт")
        )
    )

    private val enAirport = Category(
        "Аэропорт", listOf(
            Word("airport", "[ˈeəpɔːt]", "аэропорт"),
            Word("flight", "[flaɪt]", "рейс"),
            Word("ticket", "[ˈtɪkɪt]", "билет"),
            Word("passport", "[ˈpɑːspɔːt]", "паспорт"),
            Word("boarding pass", "[ˈbɔːdɪŋ pɑːs]", "посадочный талон"),
            Word("gate", "[ɡeɪt]", "выход на посадку"),
            Word("luggage", "[ˈlʌɡɪdʒ]", "багаж"),
            Word("departure", "[dɪˈpɑːtʃə]", "отправление"),
            Word("arrival", "[əˈraɪvl]", "прибытие"),
            Word("delay", "[dɪˈleɪ]", "задержка"),
            Word("runway", "[ˈrʌnweɪ]", "взлётная полоса"),
            Word("customs", "[ˈkʌstəmz]", "таможня")
        )
    )

    private val enShop = Category(
        "Магазин", listOf(
            Word("shop", "[ʃɒp]", "магазин"),
            Word("money", "[ˈmʌni]", "деньги"),
            Word("price", "[praɪs]", "цена"),
            Word("cash", "[kæʃ]", "наличные"),
            Word("credit card", "[ˈkredɪt kɑːd]", "кредитная карта"),
            Word("discount", "[ˈdɪskaʊnt]", "скидка"),
            Word("receipt", "[rɪˈsiːt]", "чек"),
            Word("change", "[tʃeɪndʒ]", "сдача"),
            Word("sale", "[seɪl]", "распродажа"),
            Word("bag", "[bæɡ]", "сумка"),
            Word("cashier", "[kæˈʃɪə]", "кассир"),
            Word("expensive", "[ɪkˈspensɪv]", "дорого")
        )
    )

    private val enRestaurant = Category(
        "Ресторан", listOf(
            Word("menu", "[ˈmenjuː]", "меню"),
            Word("water", "[ˈwɔːtə]", "вода"),
            Word("bread", "[bred]", "хлеб"),
            Word("bill", "[bɪl]", "счёт"),
            Word("waiter", "[ˈweɪtə]", "официант"),
            Word("tip", "[tɪp]", "чаевые"),
            Word("fork", "[fɔːk]", "вилка"),
            Word("knife", "[naɪf]", "нож"),
            Word("spoon", "[spuːn]", "ложка"),
            Word("plate", "[pleɪt]", "тарелка"),
            Word("cup", "[kʌp]", "чашка"),
            Word("delicious", "[dɪˈlɪʃəs]", "вкусный")
        )
    )

    private val enTransport = Category(
        "Транспорт", listOf(
            Word("bus", "[bʌs]", "автобус"),
            Word("train", "[treɪn]", "поезд"),
            Word("taxi", "[ˈtæksi]", "такси"),
            Word("metro", "[ˈmetrəʊ]", "метро"),
            Word("station", "[ˈsteɪʃn]", "станция"),
            Word("stop", "[stɒp]", "остановка"),
            Word("ticket", "[ˈtɪkɪt]", "билет"),
            Word("driver", "[ˈdraɪvə]", "водитель"),
            Word("street", "[striːt]", "улица"),
            Word("road", "[rəʊd]", "дорога"),
            Word("car", "[kɑː]", "машина"),
            Word("bicycle", "[ˈbaɪsɪkl]", "велосипед")
        )
    )

    private val enEmergency = Category(
        "Экстренные ситуации", listOf(
            Word("help", "[help]", "помощь"),
            Word("police", "[pəˈliːs]", "полиция"),
            Word("doctor", "[ˈdɒktə]", "врач"),
            Word("hospital", "[ˈhɒspɪtl]", "больница"),
            Word("fire", "[ˈfaɪə]", "пожар"),
            Word("danger", "[ˈdeɪndʒə]", "опасность"),
            Word("lost", "[lɒst]", "потерян"),
            Word("accident", "[ˈæksɪdənt]", "авария"),
            Word("emergency", "[ɪˈmɜːdʒənsi]", "чрезвычайная ситуация"),
            Word("ambulance", "[ˈæmbjələns]", "скорая помощь"),
            Word("pharmacy", "[ˈfɑːməsi]", "аптека"),
            Word("medicine", "[ˈmedsn]", "лекарство")
        )
    )

    private val enGreetings = Category(
        "Приветствия", listOf(
            Word("hello", "[həˈləʊ]", "привет"),
            Word("goodbye", "[ˌɡʊdˈbaɪ]", "до свидания"),
            Word("thank you", "[ˈθæŋk juː]", "спасибо"),
            Word("please", "[pliːz]", "пожалуйста"),
            Word("sorry", "[ˈsɒri]", "извините"),
            Word("yes", "[jes]", "да"),
            Word("no", "[nəʊ]", "нет"),
            Word("good morning", "[ɡʊd ˈmɔːnɪŋ]", "доброе утро"),
            Word("good evening", "[ɡʊd ˈiːvnɪŋ]", "добрый вечер"),
            Word("excuse me", "[ɪkˈskjuːz miː]", "простите"),
            Word("how are you", "[haʊ ɑː juː]", "как дела"),
            Word("nice to meet you", "[naɪs tuː miːt juː]", "приятно познакомиться")
        )
    )

    // ------- Категории немецкого -------
    private val deHotel = Category("Отель", listOf(
        Word("Hotel", "[hoˈtɛl]", "отель"),
        Word("Zimmer", "[ˈtsɪmɐ]", "комната"),
        Word("Schlüssel", "[ˈʃlʏsl̩]", "ключ"),
        Word("Rezeption", "[retsɛpˈtsi̯oːn]", "стойка регистрации"),
        Word("Anmeldung", "[ˈanmɛldʊŋ]", "регистрация"),
        Word("Abreise", "[ˈapʁaɪzə]", "выписка"),
        Word("Reservierung", "[ʁezɛʁˈviːʁʊŋ]", "бронирование"),
        Word("Frühstück", "[ˈfʁyːʃtʏk]", "завтрак"),
        Word("Handtuch", "[ˈhanttuːx]", "полотенце"),
        Word("Kissen", "[ˈkɪsn̩]", "подушка"),
        Word("Gepäck", "[ɡəˈpɛk]", "багаж"),
        Word("Aufzug", "[ˈaʊftsuːk]", "лифт")
    ))

    private val deAirport = Category("Аэропорт", listOf(
        Word("Flughafen", "[ˈfluːkhaːfn̩]", "аэропорт"),
        Word("Flug", "[fluːk]", "рейс"),
        Word("Ticket", "[ˈtɪkət]", "билет"),
        Word("Reisepass", "[ˈʁaɪzəpas]", "паспорт"),
        Word("Bordkarte", "[ˈbɔʁtkaʁtə]", "посадочный талон"),
        Word("Gate", "[ɡeɪt]", "выход на посадку"),
        Word("Gepäck", "[ɡəˈpɛk]", "багаж"),
        Word("Abflug", "[ˈapfluːk]", "отправление"),
        Word("Ankunft", "[ˈankʊnft]", "прибытие"),
        Word("Verspätung", "[fɛɐ̯ˈʃpɛːtʊŋ]", "задержка"),
        Word("Startbahn", "[ˈʃtaʁtbaːn]", "взлётная полоса"),
        Word("Zoll", "[tsɔl]", "таможня")
    ))

    private val deShop = Category("Магазин", listOf(
        Word("Geschäft", "[ɡəˈʃɛft]", "магазин"),
        Word("Geld", "[ɡɛlt]", "деньги"),
        Word("Preis", "[pʁaɪs]", "цена"),
        Word("Bargeld", "[ˈbaːɐ̯ɡɛlt]", "наличные"),
        Word("Kreditkarte", "[kʁeˈdiːtkaʁtə]", "кредитная карта"),
        Word("Rabatt", "[ʁaˈbat]", "скидка"),
        Word("Quittung", "[ˈkvɪtʊŋ]", "чек"),
        Word("Wechselgeld", "[ˈvɛksl̩ɡɛlt]", "сдача"),
        Word("Ausverkauf", "[ˈaʊsfɛɐ̯kaʊf]", "распродажа"),
        Word("Tasche", "[ˈtaʃə]", "сумка"),
        Word("Kassierer", "[kaˈsiːʁɐ]", "кассир"),
        Word("teuer", "[ˈtɔʏɐ]", "дорого")
    ))

    private val deRestaurant = Category("Ресторан", listOf(
        Word("Speisekarte", "[ˈʃpaɪzəkaʁtə]", "меню"),
        Word("Wasser", "[ˈvasɐ]", "вода"),
        Word("Brot", "[bʁoːt]", "хлеб"),
        Word("Rechnung", "[ˈʁɛçnʊŋ]", "счёт"),
        Word("Kellner", "[ˈkɛlnɐ]", "официант"),
        Word("Trinkgeld", "[ˈtʁɪŋkɡɛlt]", "чаевые"),
        Word("Gabel", "[ˈɡaːbl̩]", "вилка"),
        Word("Messer", "[ˈmɛsɐ]", "нож"),
        Word("Löffel", "[ˈlœfl̩]", "ложка"),
        Word("Teller", "[ˈtɛlɐ]", "тарелка"),
        Word("Tasse", "[ˈtasə]", "чашка"),
        Word("lecker", "[ˈlɛkɐ]", "вкусный")
    ))

    private val deTransport = Category("Транспорт", listOf(
        Word("Bus", "[bʊs]", "автобус"),
        Word("Zug", "[tsuːk]", "поезд"),
        Word("Taxi", "[ˈtaksi]", "такси"),
        Word("U-Bahn", "[ˈuːbaːn]", "метро"),
        Word("Bahnhof", "[ˈbaːnhoːf]", "станция"),
        Word("Haltestelle", "[ˈhaltəʃtɛlə]", "остановка"),
        Word("Fahrkarte", "[ˈfaːɐ̯kaʁtə]", "билет"),
        Word("Fahrer", "[ˈfaːʁɐ]", "водитель"),
        Word("Straße", "[ˈʃtʁaːsə]", "улица"),
        Word("Weg", "[veːk]", "дорога"),
        Word("Auto", "[ˈaʊto]", "машина"),
        Word("Fahrrad", "[ˈfaːɐ̯ʁaːt]", "велосипед")
    ))

    private val deEmergency = Category("Экстренные ситуации", listOf(
        Word("Hilfe", "[ˈhɪlfə]", "помощь"),
        Word("Polizei", "[poliˈtsaɪ]", "полиция"),
        Word("Arzt", "[aːɐ̯tst]", "врач"),
        Word("Krankenhaus", "[ˈkʁaŋkn̩haʊs]", "больница"),
        Word("Feuer", "[ˈfɔʏɐ]", "пожар"),
        Word("Gefahr", "[ɡəˈfaːɐ̯]", "опасность"),
        Word("verloren", "[fɛɐ̯ˈloːʁən]", "потерян"),
        Word("Unfall", "[ˈʊnfal]", "авария"),
        Word("Notfall", "[ˈnɔtfal]", "чрезвычайная ситуация"),
        Word("Krankenwagen", "[ˈkʁaŋkn̩vaːɡn̩]", "скорая помощь"),
        Word("Apotheke", "[apoˈteːkə]", "аптека"),
        Word("Medizin", "[mediˈtsiːn]", "лекарство")
    ))

    private val deGreetings = Category("Приветствия", listOf(
        Word("Hallo", "[haˈloː]", "привет"),
        Word("Tschüss", "[tʃʏs]", "пока"),
        Word("Danke", "[ˈdaŋkə]", "спасибо"),
        Word("Bitte", "[ˈbɪtə]", "пожалуйста"),
        Word("Entschuldigung", "[ɛntˈʃʊldɪɡʊŋ]", "извините"),
        Word("Ja", "[jaː]", "да"),
        Word("Nein", "[naɪn]", "нет"),
        Word("Guten Morgen", "[ˈɡuːtn̩ ˈmɔʁɡn̩]", "доброе утро"),
        Word("Guten Abend", "[ˈɡuːtn̩ ˈaːbn̩t]", "добрый вечер"),
        Word("Entschuldigen Sie", "[ɛntˈʃʊldɪɡn̩ ziː]", "простите"),
        Word("Wie geht's", "[viː ɡeːts]", "как дела"),
        Word("Freut mich", "[fʁɔʏt mɪç]", "приятно познакомиться")
    ))

    // ------- Категории японского -------
    private val jaHotel = Category("Отель", listOf(
        Word("ホテル", "хотэру", "отель"),
        Word("部屋", "хэя", "комната"),
        Word("鍵", "каги", "ключ"),
        Word("受付", "укэцукэ", "стойка регистрации"),
        Word("チェックイン", "чэкку-ин", "регистрация"),
        Word("チェックアウト", "чэкку-ауто", "выписка"),
        Word("予約", "ёяку", "бронирование"),
        Word("朝食", "тё:сёку", "завтрак"),
        Word("タオル", "таору", "полотенце"),
        Word("枕", "макура", "подушка"),
        Word("荷物", "нимоцу", "багаж"),
        Word("エレベーター", "эрэбэ:та:", "лифт")
    ))

    private val jaAirport = Category("Аэропорт", listOf(
        Word("空港", "ку:ко:", "аэропорт"),
        Word("便", "бин", "рейс"),
        Word("切符", "киппу", "билет"),
        Word("パスポート", "пасупо:то", "паспорт"),
        Word("搭乗券", "то:дзё:кэн", "посадочный талон"),
        Word("ゲート", "гэ:то", "выход на посадку"),
        Word("荷物", "нимоцу", "багаж"),
        Word("出発", "сюппацу", "отправление"),
        Word("到着", "то:тяку", "прибытие"),
        Word("遅延", "тиэн", "задержка"),
        Word("滑走路", "кассо:ро", "взлётная полоса"),
        Word("税関", "дзэйкан", "таможня")
    ))

    private val jaShop = Category("Магазин", listOf(
        Word("店", "мисэ", "магазин"),
        Word("お金", "ока:нэ", "деньги"),
        Word("値段", "нэдан", "цена"),
        Word("現金", "гэнкин", "наличные"),
        Word("クレジットカード", "курэдзитто ка:до", "кредитная карта"),
        Word("割引", "варибики", "скидка"),
        Word("レシート", "рэси:то", "чек"),
        Word("お釣り", "оцури", "сдача"),
        Word("セール", "сэ:ру", "распродажа"),
        Word("鞄", "кабан", "сумка"),
        Word("レジ", "рэдзи", "касса"),
        Word("高い", "такай", "дорого")
    ))

    private val jaRestaurant = Category("Ресторан", listOf(
        Word("メニュー", "мэню:", "меню"),
        Word("水", "мидзу", "вода"),
        Word("パン", "пан", "хлеб"),
        Word("お会計", "окайкэй", "счёт"),
        Word("ウェイター", "вэйта:", "официант"),
        Word("チップ", "типпу", "чаевые"),
        Word("フォーク", "фо:ку", "вилка"),
        Word("ナイフ", "найфу", "нож"),
        Word("スプーン", "супу:н", "ложка"),
        Word("皿", "сара", "тарелка"),
        Word("カップ", "каппу", "чашка"),
        Word("美味しい", "ойсий", "вкусный")
    ))

    private val jaTransport = Category("Транспорт", listOf(
        Word("バス", "басу", "автобус"),
        Word("電車", "дэнся", "поезд"),
        Word("タクシー", "такуси:", "такси"),
        Word("地下鉄", "тикатэцу", "метро"),
        Word("駅", "эки", "станция"),
        Word("バス停", "басутэй", "остановка"),
        Word("切符", "киппу", "билет"),
        Word("運転手", "унтэнсю", "водитель"),
        Word("通り", "то:ри", "улица"),
        Word("道", "мити", "дорога"),
        Word("車", "курума", "машина"),
        Word("自転車", "дзитэнся", "велосипед")
    ))

    private val jaEmergency = Category("Экстренные ситуации", listOf(
        Word("助けて", "тасутэтэ", "помогите"),
        Word("警察", "кэйсацу", "полиция"),
        Word("医者", "ися", "врач"),
        Word("病院", "бё:ин", "больница"),
        Word("火事", "кадзи", "пожар"),
        Word("危険", "кикэн", "опасность"),
        Word("なくした", "накусита", "потерял"),
        Word("事故", "дзико", "авария"),
        Word("緊急", "кинкю:", "чрезвычайная ситуация"),
        Word("救急車", "кю:кю:ся", "скорая помощь"),
        Word("薬局", "яккёку", "аптека"),
        Word("薬", "кусури", "лекарство")
    ))

    private val jaGreetings = Category("Приветствия", listOf(
        Word("こんにちは", "коннитива", "здравствуйте"),
        Word("さようなら", "саё:нара", "до свидания"),
        Word("ありがとう", "аригато:", "спасибо"),
        Word("お願いします", "онэгайсимас", "пожалуйста"),
        Word("すみません", "сумимасэн", "извините"),
        Word("はい", "хай", "да"),
        Word("いいえ", "и:э", "нет"),
        Word("おはよう", "охаё:", "доброе утро"),
        Word("こんばんは", "комбанва", "добрый вечер"),
        Word("失礼します", "сицурэйсимас", "простите"),
        Word("元気ですか", "гэнки дэс ка", "как дела"),
        Word("はじめまして", "хадзимэмаситэ", "приятно познакомиться")
    ))

    fun getCategories(language: Language): List<Category> = when (language) {
        Language.ENGLISH -> listOf(enHotel, enAirport, enShop, enRestaurant, enTransport, enEmergency, enGreetings)
        Language.GERMAN -> listOf(deHotel, deAirport, deShop, deRestaurant, deTransport, deEmergency, deGreetings)
        Language.JAPANESE -> listOf(jaHotel, jaAirport, jaShop, jaRestaurant, jaTransport, jaEmergency, jaGreetings)
    }
}