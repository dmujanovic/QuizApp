package dmujanovic.quizzapp

object Constants{

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1, "Koje su dvije glavne vrste alpaki?",
            R.drawable.firstquestion,
            "Pitome i divlje",
            "Suri & Huacaya",
            "Azijska i Australijska",
            "Camelid i Gothic",
            2
        )
        questionList.add(que1)

        val que2 = Question(
            2, "Koji je glavni izvor hrane alpaki?",
            R.drawable.secondquestion,
            "Biljke i trave",
            "Male životinje",
            "Insekti",
            "Sve od navedenog",
            1
        )
        questionList.add(que2)

        val que3 = Question(
            3, "Koliko dugo žive alpake?",
            R.drawable.thirdquestion,
            "2 godine",
            "10 godina",
            "10-20 godina",
            "20+ godina",
            4
        )
        questionList.add(que3)

        val que4 = Question(
            4, "Jesu li alpake veće ili manje od ljama?",
            R.drawable.fourthquestion,
            "Veće",
            "Manje",
            "Iste su",
            "Ne znam",
            2
        )
        questionList.add(que4)

        val que5 = Question(
            5, "Koji par je povezan sa alpakama?",
            R.drawable.fifthquestion,
            "Deve i konji",
            "Konji i ljame",
            "Ljame i deve",
            "Ljame, deve i konji",
            3
        )
        questionList.add(que5)

        val que6 = Question(
            6, "Kako se zove beba alpaka?",
            R.drawable.sixthquestion,
            "Tele",
            "Janje",
            "Cria",
            "Junetina",
            3
        )
        questionList.add(que6)

        val que7 = Question(
            7, "Koja tvrdnja o alpakama je točna?",
            R.drawable.seventhquestion,
            "Alpake se drže zajedno",
            "Alpake vole biti same",
            "Alpake se drže odvojeno",
            "Alpake ne vole biti u krdu",
            1
        )
        questionList.add(que7)

        val que8 = Question(
            8, "Mogu li se alpake jahati?",
            R.drawable.eightquestion,
            "Samo muške",
            "Samo ženske",
            "Mogu oboje",
            "Ne mogu",
            4
        )
        questionList.add(que8)

        val que9 = Question(
            9, "Koji zvuk alpake proizvode?",
            R.drawable.ninthqeustion,
            "Humming (zujanje)",
            "Baaaaaaaaaaaaaa",
            "Beat box",
            "Muuuuuuuuuuu",
            1
        )
        questionList.add(que9)

        val que10 = Question(
            10, "Kada se alpakama šiša vuna?",
            R.drawable.tenthquestion,
            "U zimi",
            "Bilo kad",
            "U proljeće",
            "Kad napune 5 godina",
            3
        )
        questionList.add(que10)

        return questionList
    }
}