package hamlet;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by hamleta on 3/10/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {
    private Long id;
    private String quote;

    public void setId(Long i) {
        id = i;
    }

    public Long getId() {
        return id;
    }

    public void setQuote(String q) {
        quote = q;
    }

    public String getQuote() {
        return quote;
    }

    @Override
    public String toString() {
        return "Value {" + "id=" + id + ", quote=" + quote
                + "}";
    }
}
