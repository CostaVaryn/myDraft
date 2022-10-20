package stepik.javabasics.languagebasics.setsanddictionaries;

import java.util.*;

public class DictionariesAndSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        HashSet<String> set = new HashSet<>();
        LinkedHashMap<String, Set<String>> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            set.clear();
            String string = sc.nextLine();
            String[] strings = string.split("[ :]");
            for (int j = 1; j < strings.length; j++){
                set.add(strings[j].toLowerCase());
            }
            map.put(strings[0], (HashSet<String>)set.clone());
        }

        int k = sc.nextInt();
        int max = 0;
        String winner = "";
        for (String key : map.keySet()){
            int p = 0;
            for (String word : map.get(key)){
                if(word.length() >= k){
                    p++;
                }
            }
            if(p > max){
                max = p;
                winner = key;
            }
        }
        System.out.println(winner + " " + max);
    }
}

/*
Несколько друзей решили сыграть в игру: кто больше слов знает.
Они сели за стол и стали записывать все слова, которые только пришли им на ум.
После чего стали сравнивать, у кого больше слов.
В этот момент стало понятно, что некоторые ребята по ошибке записали какие-то слова несколько раз.
Разумеется, повторяющиеся слова вычеркнули.
Потом они поняли, что слов слишком много, поэтому решили считать только те, длина которых не меньше, чем K.
Помогите ребятам узнать, кто же знает больше слов. Гарантируется, что есть единственный победитель.

Входные данные:
Сначала вводится число n - количество ребят. Затем идёт n строк вида:

"Имя ребёнка: слово1 слово2 слово3 и т.д."

После чего вводится число K.

Выходные данные:
Выведите на экран имя ребёнка и количество слов, которое он знает
(они не должны повторяться и их длина должна быть не меньше К).

Учтите, что некоторые слова дети могут написать в разных регистрах.
Например, слова "Слово" и "слово" - это одно и то же.

Sample Input:
3
Андрей: гусь Мама папа крик машина кто где вот таз кар рак так
Маша: карлик планета монета Планета Карлик Монета
Игорь: ковролин математика физика кот суп душ май химия хитрость
5
Sample Output:
Игорь 5
 */