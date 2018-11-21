import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatButtonModule, MatCheckboxModule} from '@angular/material';
import {MatMenuModule} from '@angular/material/menu';
import { FooterComponent } from './footer/footer.component';
import { HeaderComponent } from './header/header.component';
import { InscriptionUserComponent } from './inscription-user/inscription-user.component';
import { InscriptionMediaComponent } from './inscription-media/inscription-media.component';
import { ArticleComponent } from './article/article.component';
import { FicheMediaComponent } from './fiche-media/fiche-media.component';
import { ApiTestCompsantComponent } from './api-test-compsant/api-test-compsant.component';


@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    HeaderComponent,
    InscriptionUserComponent,
    InscriptionMediaComponent,
    ArticleComponent,
    FicheMediaComponent,
    ApiTestCompsantComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatCheckboxModule,
    MatMenuModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
