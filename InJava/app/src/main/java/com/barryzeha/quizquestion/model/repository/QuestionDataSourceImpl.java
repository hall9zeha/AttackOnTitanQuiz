package com.barryzeha.quizquestion.model.repository;

import com.barryzeha.quizquestion.model.QuestionModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/****
 * Project QuizQuestion
 * Created by Barry Zea H. on 02/10/2022
 * Copyright (c)  All rights reserved.
 ***/
public class QuestionDataSourceImpl implements QuestionDataSource{
    @Override
    public  List<QuestionModel>generateRandomList(HashSet<Integer> randomSet){
        List<QuestionModel> randomQuestionList = new ArrayList<>();
        List<QuestionModel> questions = questionsProvider();
        for(int index : randomSet){
            randomQuestionList.add(questions.get(index));
        }
         return randomQuestionList;
    }
    private static List<QuestionModel> questionsProvider(){
        return new ArrayList<>(Arrays.asList(
                new QuestionModel(
                        "Todos sabemos que Jaeger en alemán es cazador, pero ¿sabes qué significa Eren y en qué idioma está?",
                        "https://tierragamer.com/wp-content/uploads/2021/07/attack-on-titan-test-resultado-eren-768x432.jpg",
                        "Santo/Turco.",
                        "Demonio/Hebreo",
                        "Héroe/Turco",
                        1
                ),
                new QuestionModel(
                        "¿Qué número ocupaba el rey Karl Fritz en la descendencia real?",
                        "https://tierragamer.com/wp-content/uploads/2021/07/karl-fritz-shingeki-test-768x432.jpg",
                        "Era el 136° rey.",
                        "Era el 145 rey.",
                        "Era el 126 rey.",
                        2
                ),
                new QuestionModel(
                        "¿Cuál es el nombre de la revista en donde se publica el manga?",
                        "https://tierragamer.com/wp-content/uploads/2021/07/test-shingeki-768x432.jpg",
                        "Weekly Shonen Jump.",
                        "Shonen Magazine",
                        "Bessatsu Shonen Magazine.",
                        3
                ),
                new QuestionModel(
                        "¿Cuál es el nombre de la primera esposa de Grisha Jaeger?",
                        "https://tierragamer.com/wp-content/uploads/2021/07/shingeki-test-grisha-jaeger-768x432.jpg",
                        "Carla Jaeger",
                        "Dina Fritz",
                        "Frieda Reiss",
                        2
                ),
                new QuestionModel(
                        "¿Cuál es la generación de la que Eren se graduó como cadete?",
                        "https://tierragamer.com/wp-content/uploads/2021/07/shingeki-test-manga-768x432.jpg",
                        "101°",
                        "104°",
                        "98°",
                        2
                ),
                new QuestionModel(
                        "¿En qué año se estrenó el anime de Shingeki no Kyojin?",
                        "https://tierragamer.com/wp-content/uploads/2021/07/shingeki-anime-estreno-test-768x432.png",
                        "2011",
                        "2012",
                        "2013",
                        3
                ),
                new QuestionModel(
                        "Después de la muerte de Erwin, ¿quién es el comandante de la Legión de Reconocimiento?",
                        "https://tierragamer.com/wp-content/uploads/2021/07/shingeki-test-erwin-768x432.jpg",
                        "Levi Ackerman",
                        "Hange Zoë",
                        "Dot Pixis",
                        2
                ),
                new QuestionModel(
                        "Entre los guerreros de Marley, ¿quién estaba entrenando para ser el próximo titán bestia?",
                        "https://tierragamer.com/wp-content/uploads/2021/07/shingeki-test-marley-warriors-1-768x432.jpg",
                        "Zofia",
                        "Falco Grice",
                        "Colt Grice",
                        3
                ),
                new QuestionModel(
                        "¿En quién se inspiró Hajime Isayama para los titanes",
                        "https://tierragamer.com/wp-content/uploads/2021/07/titanes-e1614889610916-768x432.jpg",
                        "Borrachos",
                        "Vagabundos",
                        "Personajes de sus pesadillas",
                        1
                ),
                new QuestionModel(
                        "¿Qué es lo más bajo que puede llegar a medir un titán?",
                        "https://tierragamer.com/wp-content/uploads/2021/07/shingeki-titanes-test-hange-768x432.jpg",
                        "3",
                        "5",
                        "6",
                        1
                ),
                new QuestionModel(
                        "¿Cuál es el nombre japonés de 'Attack on Titan'?",
                        "https://s1.1zoom.me/big0/38/Attack_on_Titan_eren_442810.jpg",
                        "Kimi y Todoke",
                        "Kosaku Shima",
                        "Shingeki no Kyojin",
                        3
                ),
                new QuestionModel(
                        "Mientras está en su forma de titán puro, ¿quién se come a Bertholdt Hoover?",
                        "https://pm1.narvii.com/7859/dec0e1c0a29766263a4a4316edb92a9ee4f20b0dr1-736-414v2_hq.jpg",
                        "Reiner Braun",
                        "armin arlert",
                        "Eren Yeager",
                        2
                ),
                new QuestionModel(
                        "¿Con quién se une Levi para rescatar a Eren de la Titán Femenina?",
                        "https://w.wallhaven.cc/full/5d/wallhaven-5dg771.jpg",
                        "Mikasa Ackerman",
                        "Jean Kirschtien",
                        "Kitz Weilman",
                        1
                ),
                new QuestionModel(
                        "¿Cuál es el método que convierte a los hijos de Ymir en titanes?",
                        "https://w.wallhaven.cc/full/0p/wallhaven-0pgrqp.jpg",
                        "Comido por un Titán existente",
                        "Tortura",
                        "Una inyección",
                        3
                ),
                new QuestionModel(
                        "¿Las 3 paredes recibieron el nombre de las hijas de qué rey?",
                        "https://w.wallhaven.cc/full/y8/wallhaven-y8qj9g.png",
                        "El rey del beautiful",
                        "Rey Fritz",
                        "Rey demonio",
                        2
                ),
                new QuestionModel(
                        "¿Qué relación tiene Kenny el Destripador con Levi Ackerman?",
                        "https://w.wallhaven.cc/full/pk/wallhaven-pk9qop.png",
                        "Su tío",
                        "Su padre",
                        "Su hermano",
                        1
                ),
                new QuestionModel(
                        "El Titan fundador permite a su usuario hacerse con el control de otros titanes ¿haciendo qué?",
                        "https://tierragamer.com/wp-content/uploads/2022/02/titan-fundador-shingeki-no-kyojin-768x432.jpg",
                        "Silbar",
                        "Gritando",
                        "Telepatía",
                        2
                ),
                new QuestionModel(
                        "¿De quién se disfrazó Jean Kirschtein cuando fue llevado a la Capital Imperial para ser juzgado?",
                        "https://www.geekmi.news/__export/1629127349152/sites/debate/img/2021/08/16/jean1.jpg_976912859.jpg",
                        "Levi Ackermann",
                        "Eren Yeager",
                        "Connie Springer",
                        2
                ),
                new QuestionModel(
                        "¿Qué encontró Levi en el fondo falso del escritorio del sótano de Eren?",
                        "https://static.wikia.nocookie.net/shingekinokyojin/images/9/90/Anime_basement.png",
                        "Libros",
                        "Un amuleto",
                        "Una llave",
                        1
                ),
                new QuestionModel(
                        "¿Cómo activó Eren accidentalmente su transformación en Titán?",
                        "https://w.wallhaven.cc/full/ym/wallhaven-ym63ol.jpg",
                        "Tratando de coger una cuchara ",
                        "Estornudos",
                        "Montando a caballo",
                        1
                ),
                new QuestionModel(
                        "¿Cuánto tiempo vive alguien después de comerse a una persona que controla a uno de los 9 Titanes?",
                        "https://w.wallhaven.cc/full/49/wallhaven-49dj6x.jpg",
                        "10 años",
                        "13 años",
                        "19 años",
                        2
                ),
                new QuestionModel(
                        "¿Cuál fue el último regalo que Kenny Ackermann le dio a Levi?",
                        "https://i.ytimg.com/vi/GIJmmMs8OrQ/maxresdefault.jpg",
                        "Una de sus armas",
                        "Un collar de la madre de Levi",
                        "Inyección de Titán",
                        3
                ),
                new QuestionModel(
                        "¿De qué color eran las bengalas de señales que usaba el Regimiento Scout para advertir de los titanes que se acercaban?",
                        "https://pm1.narvii.com/6282/ac1dfac4496aa8f22d32595064f31bdba021bd80_hq.jpg",
                        "Amarrillo y naranja",
                        "Blanco verde",
                        "Negro rojo",
                        3
                ),
                new QuestionModel(
                        "¿Kiyomi Azumabito es el embajador de qué nación?",
                        "https://static1.dualshockersimages.com/wordpress/wp-content/uploads/2022/03/Who-is-Azumabito-in-Attack-on-Titan.jpg",
                        "Hizaru",
                        "Andor",
                        "Star city",
                        1
                ),
                new QuestionModel(
                        "¿En qué año tuvo lugar la batalla del distrito de Shiganshina?",
                        "https://w.wallhaven.cc/full/95/wallhaven-9578jw.jpg",
                        "875",
                        "850",
                        "920",
                        2
                ),
                new QuestionModel(
                        "¿Qué usa Eren para sellar Wall Rose después de su ruptura?",
                        "https://w.wallhaven.cc/full/ne/wallhaven-neyp68.jpg",
                        "Un titán muerto",
                        "Cristal de titán",
                        "Una roca",
                        3
                ),
                new QuestionModel(
                        "En la mitología eldiana, ¿quién le otorgó a Ymir Fritz el poder de los titanes?",
                        "https://static1.cbrimages.com/wordpress/wp-content/uploads/2020/02/Attack-on-Titan-Ymir-Fritz-Founder-header.png",
                        "El engendro del diable",
                        "El diablo de toda la tierra",
                        "El diablo de Helos",
                        2
                )


        ));
    }

}
