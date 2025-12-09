/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.lunchtray.datasource

import com.example.lunchtray.model.MenuItem.AccompanimentItem
import com.example.lunchtray.model.MenuItem.EntreeItem
import com.example.lunchtray.model.MenuItem.SideDishItem

/**
 * Map of available menu items to be displayed in the menu fragments.
 */
object DataSource {

    val entreeMenuItems = listOf(
        EntreeItem(
            name = "Pozole Rojo",
            description = "Tradicional caldo de cerdo con maíz, chile guajillo, servido con lechuga y rábano",
            price = 8.50,
        ),
        EntreeItem(
            name = "Enchiladas Verdes",
            description = "Tres tortillas rellenas de pollo, bañadas en salsa de tomatillo, crema y queso fresco",
            price = 9.00,
        ),
        EntreeItem(
            name = "Tacos al Pastor",
            description = "Cerdo marinado en achiote, piña asada, cilantro y cebolla sobre tortillas de maíz",
            price = 7.00,
        ),
        EntreeItem(
            name = "Chiles Rellenos",
            description = "Chile poblano asado relleno de queso panela, capeado y servido en caldillo de jitomate",
            price = 8.00,
        )
    )

    val sideDishMenuItems = listOf(
        SideDishItem(
            name = "Guacamole con Totopos",
            description = "Aguacate fresco, jitomate, cebolla, cilantro y limónAcompañado de totopos caseros",
            price = 4.50,
        ),
        SideDishItem(
            name = "Arroz a la Mexicana",
            description = "Arroz rojo cocinado con caldillo de jitomate, zanahorias y chícharos",
            price = 3.00,
        ),
        SideDishItem(
            name = "Esquites",
            description = "Granos de elote hervidos con epazote, servidos con mayonesa, queso cotija y chile piquín",
            price = 3.50,
        ),
        SideDishItem(
            name = "Frijoles Refritos",
            description = "Frijoles negros y fritos, espolvoreados con queso añejo",
            price = 3.00,
        )
    )

    val accompanimentMenuItems = listOf(
        AccompanimentItem(
            name = "Churros",
            description = "Masa frita crjiente espolvoreada con azucar y canela",
            price = 2.50,
        ),
        AccompanimentItem(
            name = "Salsas Caseras",
            description = "Orden extra de salsa roja molcajeteada y salsa verde cruda",
            price = 1.00,
        ),
        AccompanimentItem(
            name = "Tortillas Hechas a Mano",
            description = "Orden de 3 tortillas de maíz azul recien hechas",
            price = 1.50,
        )
    )
}