package reviewQuiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_JiphapQuiz<T> {

        static class Fruit {}
        
        static class Apple extends Fruit {}
        static class Banana extends Fruit {}        
        static class Carrot {}
        
        public static void main(String[] args) {
                D02_JiphapQuiz<String> jiphap = new D02_JiphapQuiz<>();        
                
                List<String> A = new ArrayList<>();
                Set<String> B = new HashSet<>();
                
                A.add("Americano");
                A.add("Americano");
                A.add("Cold Brew");
                A.add("Latte");
                
                B.add("Americano");
                B.add("Coke");
                B.add("Sprite");
                
                System.out.println(jiphap.union(A, B)); //�ߺ����ŵ� ���
                System.out.println(jiphap.intersection(A, B)); //�ߺ��� �� ���
                System.out.println(jiphap.diff(B, A)); //B���� A�� �� �� 
                
                D02_JiphapQuiz<Fruit> jiphap2 = new D02_JiphapQuiz<>();
                
                List<Apple> apple_list = new ArrayList<>();
                Set<Banana> apple_set = new HashSet<>();
                
                jiphap2.union(apple_list, apple_set);
        }
        
        /*
                 1. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� Set���� ��ȯ�ϴ� �޼���
                 
                   [1, 2, 3, 4] ������ [3, 4, 5]  => [1, 2, 3, 4, 5]
                 
                 2. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� Set���� ��ȯ�ϴ� �޼���
                 
                   [1, 2, 3, 4] ������ [3, 4, 5]  => [3, 4]
                 
                 3. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� Set���� ��ȯ�ϴ� �޼���
                 
                   [1, 2, 3, 4] - [3, 4, 5] => [1, 2]
                 
                   [3, 4, 5] - [1, 2, 3, 4] => [5] 
                 
                 �� ����� �׽�Ʈ �غ�����
        */
        public HashSet<T> union(Collection<? extends T> A, Collection<? extends T> B) {
                HashSet<T> union = new HashSet<>();
                
                union.addAll(A);
                union.addAll(B);
                
                return union;
        }
        
        public HashSet<T> intersection(Collection<? extends T> A, Collection<? extends T> B) {
                HashSet<T> inter = new HashSet<>();
                
                inter.addAll(A);
                inter.retainAll(B);
                
                return inter;
        }
        
        public HashSet<T> diff(Collection<? extends T> A, Collection<? extends T> B) {
                HashSet<T> diff = new HashSet<>();
                
                diff.addAll(A);
                diff.removeAll(B);
                
                return diff;
        }
        
}














