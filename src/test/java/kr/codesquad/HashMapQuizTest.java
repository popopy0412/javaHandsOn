package kr.codesquad;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class HashMapQuizTest {
    Map<String,String> map = new HashMapQuiz().getMap();
    @Test
    @DisplayName("map의 크기 확인")
    public void test () {
        // TODO
        assertEquals(6, map.size());
    }

    @Test
    @DisplayName("map에 key: grape, val: purple 추가")
    public void testPlusNewFruit () {
        // TODO
        map.put("grape", "purple");
        assertTrue(map.containsKey("grape"));
    }

    @Test
    @DisplayName("key가 dulian인 것의 value 확인")
    public void testFindValueByKey () {
        // TODO
        assertEquals("yellow", map.get("dulian"));
    }

    @Test
    @DisplayName("map에 key가 dulian인 것 삭제")
    public void testDeleteByKey () {
        //TODO
        map.remove("dulian");
        assertFalse(map.containsKey("dulian"));
    }

    @Test
    @DisplayName("이미 존재하는 key인 apple를 삽입")
    public void testPlusExistKey () {
        // TODO
        assertThrows(IllegalArgumentException.class, () -> map.put("apple", "red"));
        // Throw를 하지 않고 덮어 씀
    }

    @Test
    @DisplayName("key: carambola, value:light green 삽입")
    public void testPlusExistValue () {
        // TODO
        map.put("carambola", "light green");
        assertTrue(map.containsKey("carambola"));
        assertTrue(map.containsValue("light green"));
    }

    @Test
    @DisplayName("map의 모든 요소 출력하기")
    public void testPrintAllElement () {
        //TODO
        // 출력결과:
        // name: apple, color: red;
        // name: banana, color: yellow;
        // ...
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("name: " + entry.getKey() + ", color: " + entry.getValue());
        }
    }
}