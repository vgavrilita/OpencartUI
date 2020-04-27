/*
package Helper;

import Steps.LoginSteps;
import io.cucumber.core.api.TypeRegistry;
import io.cucumber.core.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableEntryTransformer;

import java.util.Locale;
import java.util.Map;

public class Configurer implements TypeRegistryConfigurer {

    @Override
    public void configureTypeRegistry(TypeRegistry registry) {

        registry.defineDataTableType(new DataTableType(LoginSteps.User.class, new TableEntryTransformer<LoginSteps.User>() {
            @Override
            public LoginSteps.User transform(Map<String, String> entry) {
                return new LoginSteps.User(entry.get("username"),entry.get("password"));
            }
        }));
    }

    @Override
    public Locale locale() {
        return Locale.ENGLISH;
    }

}
*/