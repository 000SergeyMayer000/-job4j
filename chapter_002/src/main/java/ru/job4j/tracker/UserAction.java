package ru.job4j.tracker;

/**
 * интерфейс UserAction описывает действия программы Tracker
 */
public interface UserAction {
    /**
     * @return
     */
    String name();

    /**
     *
      * @param input
     * @param tracker
     * @return
     */

    boolean execute(Input input, Tracker tracker);
}
