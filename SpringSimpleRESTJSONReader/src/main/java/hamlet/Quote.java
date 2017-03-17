package hamlet;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by hamleta on 3/10/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
    private String type;
    private Value value;

    public void setType(String t)
    {
        type = t;
    }

    public String getType() {
        return type;
    }

    public void setValue(Value v) {
        value = v;
    }

    public Value getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Quote {" + "type='" + type + "', value=" + value + "}";
    }
}
