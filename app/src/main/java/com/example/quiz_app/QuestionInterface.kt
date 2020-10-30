package com.example.quiz_app

interface QuestionInterface {
    fun onQuestionReceived(question: Question)
    fun allQuestionComplete()
}