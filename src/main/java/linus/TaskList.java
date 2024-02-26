package linus;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Represents the ArrayList of Tasks.
 */
public class TaskList {
    private final ArrayList<Task> taskList;
    private static final String FILE_PATH = "./data/linus.txt";

    /**
     * Constructs a TaskList with no argument.
     */
    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    /**
     * Constructs a TaskList with a specified taskList object.
     *
     * @param tasks TaskList to be set.
     */
    public TaskList(ArrayList<Task> tasks) {
        this.taskList = tasks;
    }

    /**
     * Adds Task into TaskList.
     *
     * @param task The Task to be added.
     */
    public void addTask(Task task) {
        this.taskList.add(task);
    }

    /**
     * Removes Task at the input index within TaskList.
     *
     * @param index Index of the Task to be removed.
     */
    public void removeTask(int index) {
        assert index >= 0 && index < taskList.size() : "Invalid index.";
        this.taskList.remove(index);
    }

    /**
     * Returns the Task at the specified index within TaskList.
     *
     * @param index Index within TaskList of the Task to be retrieved.
     * @return Task to be retrieved.
     */
    public Task getTask(int index) {
        assert index >= 0 && index < taskList.size() : "Invalid index.";
        return this.taskList.get(index);
    }

    /**
     * Returns the number of Tasks in TaskList.
     *
     * @return Number of Tasks in TaskList.
     */
    public int getSize() {
        return this.taskList.size();
    }

    /**
     * Adds all Tasks in input TaskList into the current iterated TaskList.
     *
     * @param taskList TaskList containing Tasks to be added.
     */
    // rename needed below
    public void addAll(ArrayList<Task> taskList) {
        this.taskList.addAll(taskList);
    }

    /**
     * Returns TaskList containing all Tasks.
     *
     * @return TaskList containing all Tasks.
     */
    public ArrayList<Task> getAllTasks() {
        return this.taskList;
    }

    /**
     * Finds all tasks that match the keyword and returns a task list containing these tasks.
     *
     * @param findKeyword Keyword to be used for find command.
     * @return Task list containing matching tasks.
     */
    public ArrayList<Task> findMatchingTasks(String findKeyword) {
        ArrayList<Task> matchingTasks = new ArrayList<>();

        for (Task task : taskList) {
            if (task.getDescription().contains(findKeyword)) {
                matchingTasks.add(task);
            }
        }

        return matchingTasks;
    }
}
