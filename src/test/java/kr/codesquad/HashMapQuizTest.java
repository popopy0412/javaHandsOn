//package kr.codesquad;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import java.util.Map;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class HashMapQuizTest {
//    Map<String,String> map = new HashMapQuiz().getMap();
//    @Test
//    @DisplayName("map의 크기 확인")
//    public void test () {
//        // TODO
//        assertEquals();
//    }
//
//    @Test
//    @DisplayName("map에 key: grape, val: purple 추가")
//    public void testPlusNewFruit () {
//        // TODO
//        assertTrue(map.containsKey("grape"));
//    }
//
//    @Test
//    @DisplayName("key가 dulian인 것의 value 확인")
//    public void testFindValueByKey () {
//        // TODO
//        assertEquals("yellow", "yellow");
//    }
//
//    @Test
//    @DisplayName("map에 key가 dulian인 것 삭제")
//    public void testDeleteByKey () {
//        //TODO
//        assertFalse(map.containsKey("dulian"));
//    }
//
//    @Test
//    @DisplayName("이미 존재하는 key인 apple를 삽입")
//    public void testPlusExistKey () {
//        // TODO
//        assertThrows(IllegalArgumentException.class, );
//    }
//
//    @Test
//    @DisplayName("key: carambola, value:light green 삽입")
//    public void testPlusExistValue () {
//        // TODO
//        assertTrue(map.containsKey("carambola"));
//        assertTrue(map.containsValue("light green"))
//    }
//
//    @Test
//    @DisplayName("map의 모든 요소 출력하기")
//    public void testPrintAllElement () {
//        //TODO
//        // 출력결과:
//        // name: apple, color: red;
//        // name: banana, color: yellow;
//        // ...
//    }
//}