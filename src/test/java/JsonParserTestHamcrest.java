import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


class JsonParserTestHamcrest {

    @Test
    void readString() throws IOException {
        String filePath = "C:\\Users\\Densone\\IdeaProjects\\DZ_JUnit\\data2.json";

        String checkJsonParser = JsonParser.readString(filePath);
        assertThat(checkJsonParser, containsString("id"));
        assertThat(checkJsonParser, containsString("firstName"));
        assertThat(checkJsonParser, containsString("lastName"));
        assertThat(checkJsonParser, containsString("country"));
        assertThat(checkJsonParser, containsString("age"));

    }

}