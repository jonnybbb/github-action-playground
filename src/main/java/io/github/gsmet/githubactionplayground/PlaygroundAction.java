package io.github.gsmet.githubactionplayground;

import java.util.Map.Entry;

import io.quarkiverse.githubaction.Action;
import io.quarkiverse.githubaction.Commands;
import io.quarkiverse.githubaction.Inputs;

public class PlaygroundAction {

    @Action
    void action(Inputs inputs, Commands commands) {
        for (Entry<String, String> envEntry : System.getenv().entrySet()) {
           System.out.println("ENV: " + envEntry.getKey() + "=" + envEntry.getValue());
        }

        System.out.println(inputs.get("who-to-greet"));

        commands.setOutput("testKey", "testValue");
        commands.jobSummary("## Test :rocket:");
    }
}
