package io.github.gsmet.githubactionplayground;

import io.quarkiverse.githubaction.Action;
import io.quarkiverse.githubaction.Commands;
import io.quarkiverse.githubaction.Inputs;

public class PlaygroundAction {

    @Action
    void action(Inputs inputs, Commands commands) {
        System.out.println(inputs.get("who-to-greet"));

        commands.setOutput("testKey", "testValue");
        commands.jobSummary("## Test :rocket:");
    }
}
