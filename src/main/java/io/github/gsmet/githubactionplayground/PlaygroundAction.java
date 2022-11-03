package io.github.gsmet.githubactionplayground;

import io.quarkiverse.githubaction.Action;
import io.quarkiverse.githubaction.Commands;
import io.quarkiverse.githubaction.Context;
import io.quarkiverse.githubaction.Inputs;

public class PlaygroundAction {

    @Action
    void action(Inputs inputs, Commands commands, Context context) {
        System.out.println(inputs.get("who-to-greet"));

        commands.setOutput("testKey", "testValue");
        commands.setOutput("testKey2", "testValue2");
        commands.jobSummary("## Test :rocket:");
    }
}
