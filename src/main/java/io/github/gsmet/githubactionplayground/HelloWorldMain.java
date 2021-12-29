package io.github.gsmet.githubactionplayground;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class HelloWorldMain implements QuarkusApplication {

    @Override
    public int run(String... args) throws Exception {
        Context context = new Context();
        context.print();

        Inputs inputs = new Inputs();

        System.out.print(inputs.get("who-to-greet"));

        Outputs outputs = new Outputs();
        outputs.add("testKey", "testValue");
        outputs.produce();

        return 0;
    }
}