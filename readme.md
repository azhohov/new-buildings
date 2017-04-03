# Описание
Android приложение для просмотра новостроек и квартир.

По требованию или по расписанию получает список домов и квартир 
из внешнего источника (внешний файл или ресурс приложения) в формате json и 
сохраняет их в локальную БД.

# Используемые библиотеки

[Dagger 2](https://google.github.io/dagger/) - реализация DI

[ButterKnife](http://jakewharton.github.io/butterknife/) - связывание полей и методов с Android views, вместо findById

[Gson](https://github.com/google/gson) - сериализация/десереализация JSON
 
# Структура кода

`package com.azhohov.newbuildings.model` - модели приложения

`package com.azhohov.newbuildings.ui` - Пользовательский интерфейс приложения (activity, fragment)

`package com.azhohov.newbuildings.presenter` - презентеры

`package com.azhohov.newbuildings.dagger` - конфигурация Dagger 2

