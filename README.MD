# QuizQuestion Shingueki nokyojin 

Aplicación(reto técnico) de preguntas y respuestas usando la temática del anime Shingeki noKyojin(El ataque de los titanes), desarrollada en Android Studio con el patrón de arquitectura MVVM e inyección de dependencias con Dagger Hilt.

## Enunciado

* El diseño es de libre elección.
* La temática de las preguntas del cuestionario será de libre elección. Puede estar bien seguir un mismo tema (por ejemplo, preguntas sobre el universo "Harry Potter").
* En la pantalla inicial podrás comenzar a jugar o consultar el ranking de puntuaciones.
* El juego consistirá en 10 preguntas aleatorias con 3 respuestas y sólo una correcta. Recomendable crear más de 10 preguntas para que no siempre salgan las mismas. Cada vez que se responde a una pregunta, se pasará a la siguiente.
* Disponemos de 30 segundos para responder cada pregunta. El contador deberá aparecer en la pantalla, y si llega a 0 se tomará como respuesta incorrecta y se pasará a la siguiente pregunta.
* Al marcar una respuesta o finalizar el tiempo, se mostrará si se ha acertado o no la pregunta, dando feedback sobre cuál sería la respuesta correcta y navegando al cabo de un par de segundos a la siguiente pantalla.
* Sistema de puntuación:
	* Contador a 0 o respuesta incorrecta = 0 puntos.
	* Contador mayor 0 y respuesta correcta = [segundos restantes] puntos. Ej: Si quedaban 9 segundos para finalizar la cuenta atrás y se acierta la pregunta, se asignan 9 puntos.
* Una vez finalizada la pregunta número 10 se mostrará en una nueva pantalla la puntuación final y se deberá introducir un nombre para guardarla de forma persistente (aunque cerremos la app). Hecho estos se mostrará la pantalla de ranking.
* La pantalla de ranking muestra ordenados de mayor a menor los 10 mejores resultados y el nombre guardado. Desde esta pantalla siempre se podrá navegar a la pantalla inicial.

## Se utilizó :gear:

* [Room database](https://developer.android.com/jetpack/androidx/releases/room?gclid=EAIaIQobChMIh-Hoi7C_-gIVRxXUAR2kZAAsEAAYASAAEgJnivD_BwE&gclsrc=aw.ds)
* [Dagger Hilt](https://developer.android.com/training/dependency-injection/hilt-android)
* [Glide](https://developer.android.com/training/dependency-injection/hilt-android) 
* [Lyfecycle view model](https://developer.android.com/jetpack/androidx/releases/lifecycle)

## Capturas 🖼️

<img src="https://github.com/hall9zeha/AttackOnTitanQuiz/blob/main/screenshots/main.jpg" alt="drawing" width="300"/>|
<img src="https://github.com/hall9zeha/AttackOnTitanQuiz/blob/main/screenshots/ranking.jpg" alt="drawing" width="300"/>|
<img src="https://github.com/hall9zeha/AttackOnTitanQuiz/blob/main/screenshots/quiz.jpg" alt="drawing" width="300"/>

## Descarga la aplicación 
Descarga la apk [aquí]("https://github.com/hall9zeha/AttackOnTitanQuiz/tree/main/apk/QuizApp1.0_Kotlin.apk")


