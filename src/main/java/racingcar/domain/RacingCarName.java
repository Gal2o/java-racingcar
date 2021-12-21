package racingcar.domain;

import java.util.Objects;

public class RacingCarName {

    private static final int NAME_LENGTH_LIMIT = 5;
    private static final String NAME_LENGTH_LIMIT_EXCCEED_MESSAGE = "자동차 이름은 5자를 초과할 수 없습니다.";

    private final String name;

    public RacingCarName(String name) {
        if (name.length() > NAME_LENGTH_LIMIT) {
            throw new racingcar.exception.RacingGameException(NAME_LENGTH_LIMIT_EXCCEED_MESSAGE);
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RacingCarName that = (RacingCarName) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}