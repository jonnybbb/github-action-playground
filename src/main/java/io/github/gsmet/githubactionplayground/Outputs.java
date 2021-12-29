package io.github.gsmet.githubactionplayground;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * See https://docs.github.com/en/actions/learn-github-actions/workflow-commands-for-github-actions#setting-an-output-parameter
 */
public class Outputs {

    private final Map<String, String> outputs = new HashMap<>();

    public Outputs() {
    }

    public void add(String key, String value) {
        if (outputs.containsKey(key)) {
            throw new IllegalArgumentException(key + " is already defined as an output with value " + outputs.get(key));
        }

        outputs.put(key, value);
    }

    public void produce() {
        for (Entry<String, String> outputEntry : outputs.entrySet()) {
            System.out.println("::set-output name=" + outputEntry.getKey() + "::" + outputEntry.getValue());
        }
    }
}
