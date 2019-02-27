package us.codecraft.webmagic.session;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * 举个栗子
 * key: cookie
 * value: SID=dvzn2fE5K489vKlamSfTmDFNFB9tFQImdZbQ
 * 或者
 * key: authorization
 * value: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9
 */
public class Session {

    public Session(String key, String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * 一个 header 属性名
     */
    private String key;
    /**
     * 一个 header 属性值，如果 request 已经有这个 header 属性，那么会追加在尾部
     */
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Session session = (Session) o;

        return new EqualsBuilder()
                .append(key, session.key)
                .append(value, session.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(key)
                .append(value)
                .toHashCode();
    }

    @Override
    public String toString() {
        return "Session{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
