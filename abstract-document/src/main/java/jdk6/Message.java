package jdk6;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Reborn
 * @since 2018/1/24
 *
 * 优点：
 * 对于key的使用不再是随意的 一个map需要哪些key必须要继承对应的接口，集合中key有了上限
 * 同时接口种维护了key的内容
 * 同时接口种的put get方法明确了入参和出出参的类型，这也保证了类型安全
 *
 * 缺点：需要实现太多的接口
 */
public class Message implements Email {

    private final Map<String, Object> properties = new HashMap<>();

    public String getEmail() {
        return (String)properties.get(Email.key);
    }

    @Override
    public void putEmail(String email) {
        properties.put(Email.key, email);
    }
}
